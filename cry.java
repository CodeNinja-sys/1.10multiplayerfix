/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.bx;
import com.a.a.d.aad;
import com.a.a.d.mq;
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class cry
implements are {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final bx b = bx.a(", ");
    private final Map c = sz.c();
    private final List d = ov.a();
    private final Set e = aad.c();
    private final a f;

    public cry(a a2) {
        this.f = a2;
    }

    public void a(dav dav2) {
        for (String string : dav2.c()) {
            this.e.add(string);
            aae aae2 = (aae)this.c.get(string);
            if (aae2 == null) {
                aae2 = new aae(this.f);
                this.c.put(string, aae2);
            }
            aae2.a(dav2);
        }
    }

    @Override
    public Set a() {
        return this.e;
    }

    @Override
    public dbr a(bpx bpx2) {
        akx akx2 = (akx)this.c.get(bpx2.c());
        if (akx2 != null) {
            return akx2.a(bpx2);
        }
        throw new FileNotFoundException(bpx2.toString());
    }

    @Override
    public List b(bpx bpx2) {
        akx akx2 = (akx)this.c.get(bpx2.c());
        if (akx2 != null) {
            return akx2.b(bpx2);
        }
        throw new FileNotFoundException(bpx2.toString());
    }

    private void b() {
        this.c.clear();
        this.e.clear();
    }

    @Override
    public void a(List list) {
        this.b();
        a.d("Reloading ResourceManager: {}", b.a(mq.a((Iterable)list, new bjg(this))));
        for (dav dav2 : list) {
            this.a(dav2);
        }
        this.c();
    }

    @Override
    public void a(aoi aoi2) {
        this.d.add(aoi2);
        aoi2.a(this);
    }

    private void c() {
        for (aoi aoi2 : this.d) {
            aoi2.a(this);
        }
    }
}

