/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.ArrayList;

public class cjw
implements aho {
    @Override
    public boolean a(yo yo2, iu iu2) {
        ArrayList arrayList = ov.a();
        for (int i2 = 0; i2 < yo2.aI_(); ++i2) {
            bhl bhl2 = yo2.a(i2);
            if (bhl2 == null) continue;
            arrayList.add(bhl2);
            if (arrayList.size() <= 1) continue;
            bhl bhl3 = (bhl)arrayList.get(0);
            if (bhl2.a() == bhl3.a() && bhl3.b == 1 && bhl2.b == 1 && bhl3.a().l()) continue;
            return false;
        }
        return arrayList.size() == 2;
    }

    @Override
    public bhl a(yo yo2) {
        Object object;
        bhl bhl2;
        ArrayList arrayList = ov.a();
        for (int i2 = 0; i2 < yo2.aI_(); ++i2) {
            bhl2 = yo2.a(i2);
            if (bhl2 == null) continue;
            arrayList.add(bhl2);
            if (arrayList.size() <= 1) continue;
            object = (bhl)arrayList.get(0);
            if (bhl2.a() == ((bhl)object).a() && ((bhl)object).b == 1 && bhl2.b == 1 && ((bhl)object).a().l()) continue;
            return null;
        }
        if (arrayList.size() == 2) {
            bhl bhl3 = (bhl)arrayList.get(0);
            bhl2 = (bhl)arrayList.get(1);
            if (bhl3.a() == bhl2.a() && bhl3.b == 1 && bhl2.b == 1 && bhl3.a().l()) {
                object = bhl3.a();
                int n2 = ((azg)object).k() - bhl3.g();
                int n3 = ((azg)object).k() - bhl2.g();
                int n4 = n2 + n3 + ((azg)object).k() * 5 / 100;
                int n5 = ((azg)object).k() - n4;
                if (n5 < 0) {
                    n5 = 0;
                }
                return new bhl(bhl3.a(), 1, n5);
            }
        }
        return null;
    }

    @Override
    public int a() {
        return 4;
    }

    @Override
    public bhl b() {
        return null;
    }

    @Override
    public bhl[] b(yo yo2) {
        bhl[] arrbhl = new bhl[yo2.aI_()];
        for (int i2 = 0; i2 < arrbhl.length; ++i2) {
            bhl bhl2 = yo2.a(i2);
            if (bhl2 == null || !bhl2.a().q()) continue;
            arrbhl[i2] = new bhl(bhl2.a().p());
        }
        return arrbhl;
    }
}

