
package matakuliah.model;
import matakuliah.mataKuliah.MataKuliah;
import java.util.ArrayList;
import java.util.List;

public class MataKuliahDao {
    private List<MataKuliah> data = new ArrayList<MataKuliah>();
    
    public MataKuliahDao()
    {
        data.add(new MataKuliah("Budi","2013125467","4","Akuntansi","2A","Akuntansi Pengantar","3"));
        data.add(new MataKuliah("Mamat","2012432104","4","Elektro","2D","Sistem Kontrol Elektronika","5"));
        data.add(new MataKuliah("Siti","2312954392","2","Bahasa Inggris","1C","Vocabulary Building","4"));
    }
    
    public void insert(MataKuliah m)
    {
        data.add(m);
    }
    
    public void update(int index, MataKuliah m)
    {
        data.set(index, m);
    }
    
    public void delete(int index)
    {
        data.remove(index);
    }

    public MataKuliah getMataKuliah(int index)
    {
        return data.get(index);
    }

    public List<MataKuliah> getAllMataKuliah() 
    {
        return data;
    }
}
