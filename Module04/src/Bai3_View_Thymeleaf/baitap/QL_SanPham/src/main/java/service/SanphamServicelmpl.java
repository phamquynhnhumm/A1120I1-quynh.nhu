package service;

import model.SanPham;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SanphamServicelmpl implements SanphamService {
    private static Map<Integer, SanPham>  sanPhamMap;
    static {
        sanPhamMap = new HashMap<>();
        sanPhamMap.put(1,new SanPham(1,"sach",10000,"VietNam"));
        sanPhamMap.put(2,new SanPham(2,"but",7600,"TrungQuoc"));
        sanPhamMap.put(3,new SanPham(3,"thuoc",4000,"NhatBan"));
        sanPhamMap.put(4,new SanPham(4,"dem",3400,"My"));
        sanPhamMap.put(5,new SanPham(5,"kinh",5000000,"Lao"));
    }

    @Override
    public List<SanPham> finAll() {
        return new ArrayList<>(sanPhamMap.values());
    }

    @Override
    public void sava(SanPham sanPham) {
        sanPhamMap.put(sanPham.getId(), sanPham);
    }

    @Override
    public SanPham finById(int id) {
        return sanPhamMap.get(id);
    }

    @Override
    public void update(int id, SanPham sanPham) {
        sanPhamMap.put(id, sanPham);
    }

    @Override
    public void remove(int id) {
        sanPhamMap.remove(id);
    }
}

