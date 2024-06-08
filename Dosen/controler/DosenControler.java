
package Dosen.controler;

import Dosen.Dosen;
import Dosen.model.DosenDao;
import Dosen.model.FormDosen;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DosenControler 
{
    FormDosen formDosen;
    Dosen dosen;
    DosenDao dosenDao;
    int index;
    
    public DosenControler(FormDosen formDosen)
    {
        this.formDosen = formDosen;
        dosenDao = new DosenDao();
    }

    public DosenControler() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void cancel()
    {
        formDosen.getTxtNIP().setText("");
        formDosen.getTxtNama().setText("");
        formDosen.getTxtAlamat().setText("");
        formDosen.getTxtTglLahir().setText("");
        isiJenisKelamin();
    }
    
    public void isiJenisKelamin()
    {
        formDosen.getCboJenisKelamin().removeAllItems();
        formDosen.getCboJenisKelamin().addItem("L");
        formDosen.getCboJenisKelamin().addItem("P");
    }
    
    public void insert()
    {
        dosen = new Dosen();
        dosen.setNip(formDosen.getTxtNIP().getText());
        dosen.setNama(formDosen.getTxtNama().getText());
        dosen.setAlamat(formDosen.getTxtAlamat().getText());
        dosen.setJenisKelamin(formDosen.getCboJenisKelamin().getSelectedItem().toString());
        dosen.setTglalhir(formDosen.getTxtTglLahir().getText());
        dosenDao.insert(dosen);
        JOptionPane.showMessageDialog(formDosen, "Entry Data Ok");
    }
    
    public void viewData()
    {
        DefaultTableModel model = (DefaultTableModel)formDosen.getTabelDosen().getModel();
        model.setNumRows(0);
        List<Dosen> list = dosenDao.getAllDosen();
        for(Dosen dosen :list)
        {
            Object[] data = 
            {
                dosen.getNip(),
                dosen.getNama(),
                dosen.getAlamat(),
                dosen.getJenisKelamin(),
                dosen.getTglalhir()
            };
            model.addRow(data);
        }
    }
    
    public void getDosen()
    {
        int index = formDosen.getTabelDosen().getSelectedRow();
        dosen =  dosenDao.getDosen(index);
        if (dosen != null)
        {
            formDosen.getTxtNIP().setText(dosen.getNip());
            formDosen.getTxtNama().setText(dosen.getNama());
            formDosen.getTxtAlamat().setText(dosen.getAlamat());
            formDosen.getCboJenisKelamin().setSelectedItem(dosen.getJenisKelamin());
            formDosen.getTxtTglLahir().setText(dosen.getTglalhir());
        }
        else
        {
            JOptionPane.showMessageDialog(formDosen, "Dosen Tidak Ada");
        }
    }
    
    public void update()
    {
        dosen.setNip(formDosen.getTxtNIP().getText());
        dosen.setNama(formDosen.getTxtNama().getText());
        dosen.setAlamat(formDosen.getTxtAlamat().getText());
        dosen.setJenisKelamin(formDosen.getCboJenisKelamin().getSelectedItem().toString());
        dosen.setTglalhir(formDosen.getTxtTglLahir().getText());
        JOptionPane.showMessageDialog(formDosen, "Update Data OK");
    }
    
    public void delete()
        {
            dosenDao.delete(index);
            JOptionPane.showMessageDialog(formDosen, "Delete Data Ok");
        }

}
