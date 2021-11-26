package repository;

import model.Sanpham;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SanphamRepositorylmpl implements SanphamRepository {
    private  static Map<Integer, Sanpham> sanphamMap;
    static
    {
        sanphamMap = new HashMap<>();
        sanphamMap.put(1,new Sanpham(1,"nuoc",40000,"chai 100 ml","vienA"));
        sanphamMap.put(2, new Sanpham(2,"den",4500,"màu đen","ventB"));
        sanphamMap.put(3, new Sanpham(3,"sách",32500,"ô li","ventC"));
    }
    @Override
    public List<Sanpham> finAll() {
        return new ArrayList<>(sanphamMap.values());
    }

    @Override
    public void save(Sanpham sanpham) {

        sanphamMap.put(sanpham.getId(),sanpham);
    }
    @Override
    public Sanpham finById(int id) {
        return sanphamMap.get(id);
    }

    @Override
    public void update(int id, Sanpham sanpham) {
        sanphamMap.put(id,sanpham);
    }

    @Override
    public void remove(int id) {
        sanphamMap.remove(id);
    }

    @Override
    public List<Sanpham> searchSanpham(String key) {
        List<Sanpham> sanphamList= finAll();
        List<Sanpham> searchSanPham = new ArrayList<>();
        for(Sanpham sanpham:sanphamList)
        {
            if(sanpham.getTen().equals(key))
            {
                searchSanPham.add(sanpham);
            }
        }
        return searchSanPham;
    }
//    @Override
//    public List<Sanpham> searchSanpham(String key) {
//        List<Sanpham> sanphamList = finAll();
//        List<Sanpham> searchSanPham = new ArrayList<>();
//        for(Sanpham s:sanphamList)
//        {
//            if(s.getTen().toLowerCase().contains(key.toLowerCase()))
//            {
//                searchSanPham.add(s);
//            }
//        }
//        return  searchSanPham;
//    }
}
