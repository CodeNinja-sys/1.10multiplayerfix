/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class vm
implements aoi {
    private static final d b = org.apache.logging.log4j.c.c();
    private final a c;
    private String d;
    protected static final cim a = new cim();
    private final Map e = sz.c();

    public vm(a a2, String string) {
        this.c = a2;
        this.d = string;
        bf.a(a);
    }

    public void a(List list) {
        this.e.clear();
        for (dav dav2 : list) {
            try {
                cep cep2 = (cep)dav2.a(this.c, "language");
                if (cep2 == null) continue;
                for (xp xp2 : cep2.a()) {
                    if (this.e.containsKey(xp2.a())) continue;
                    this.e.put(xp2.a(), xp2);
                }
            }
            catch (RuntimeException runtimeException) {
                b.f("Unable to parse metadata section of resourcepack: {}", dav2.b(), runtimeException);
            }
            catch (IOException iOException) {
                b.f("Unable to parse metadata section of resourcepack: {}", dav2.b(), iOException);
            }
        }
    }

    @Override
    public void a(akx akx2) {
        ArrayList arrayList = ov.a(new String[]{"en_US"});
        if (!"en_US".equals(this.d)) {
            arrayList.add(this.d);
        }
        a.a(akx2, arrayList);
        dhc.a(vm.a.a);
    }

    public boolean a() {
        return a.a();
    }

    public boolean b() {
        return this.c() != null && this.c().b();
    }

    public void a(xp xp2) {
        this.d = xp2.a();
    }

    public xp c() {
        String string = this.e.containsKey(this.d) ? this.d : "en_US";
        return (xp)this.e.get(string);
    }

    public SortedSet d() {
        return aad.e(this.e.values());
    }
}

