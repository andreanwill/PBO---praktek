
package Dosen.model;

import Dosen.Dosen;
import java.util.ArrayList;
import java.util.List;


public class DosenDao 
{
    private List<Dosen> data = new ArrayList<Dosen>();
    
    public DosenDao()
    {
        data.add(new Dosen("98312100","Ronal","Padang","L","17-02-1980"));
        data.add(new Dosen("98312101","Hani","Jakarta","P","03-05-1978"));
        data.add(new Dosen("98312102","Suherman","Padang Panjang","L","29-02-1982"));
    }
    
    public void insert(Dosen d)
    {
        data.add(d);
    }
    
    public void update(int index, Dosen d)
    {
        data.set(index, d);
    }
    
    public void delete(int index)
    {
        data.remove(index);
    }

    public Dosen getDosen(int index)
    {
        return data.get(index);
    }

    public List<Dosen> getAllDosen() 
    {
        return data;
    }
}
