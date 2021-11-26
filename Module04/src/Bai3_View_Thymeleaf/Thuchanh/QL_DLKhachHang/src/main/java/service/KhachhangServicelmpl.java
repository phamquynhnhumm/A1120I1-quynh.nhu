package service;

import model.KhachHang;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class KhachhangServicelmpl implements KhachhangService {
    private static Map<Integer,KhachHang> khachHangMap;
    static {
        khachHangMap = new HashMap<>();
        khachHangMap.put(1,new KhachHang(1,"quynh","quynhnhuctcn@mail.com","ThanhHoa"));
        khachHangMap.put(2,new KhachHang(2,"nga","nga123@mail.com","ThanhHoa"));
        khachHangMap.put(3,new KhachHang(3,"xoan","nang123@mail.com","NgheAn"));
        khachHangMap.put(4,new KhachHang(4,"thuy","thanhthuy@mail.com","QuangTri"));
        khachHangMap.put(5,new KhachHang(5,"oanh","kieuoanh@mail.com","DaNang"));
    }

    @Override
    public List<KhachHang> finAll() {
        return new ArrayList<>(khachHangMap.values());
    }

    @Override
    public void sava(KhachHang khachHang) {
        khachHangMap.put(khachHang.getId(), khachHang);
    }

    @Override
    public KhachHang finById(int id) {
        return khachHangMap.get(id);
    }

    @Override
    public void update(int id, KhachHang khachHang) {
        khachHangMap.put(id, khachHang);
    }

    @Override
    public void remove(int id) {
        khachHangMap.remove(id);
    }
}

