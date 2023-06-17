/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class aae
implements akx {
    private static final d b = org.apache.logging.log4j.c.c();
    protected final List a = ov.a();
    private final a c;

    public aae(a a2) {
        this.c = a2;
    }

    public void a(dav dav2) {
        this.a.add(dav2);
    }

    @Override
    public Set a() {
        return null;
    }

    @Override
    public dbr a(bpx bpx2) {
        this.d(bpx2);
        dav dav2 = null;
        bpx bpx3 = aae.c(bpx2);
        for (int i2 = this.a.size() - 1; i2 >= 0; --i2) {
            dav dav3 = (dav)this.a.get(i2);
            if (dav2 == null && dav3.b(bpx3)) {
                dav2 = dav3;
            }
            if (!dav3.b(bpx2)) continue;
            InputStream inputStream = null;
            if (dav2 != null) {
                inputStream = this.a(bpx3, dav2);
            }
            return new bcv(dav3.b(), bpx2, this.a(bpx2, dav3), inputStream, this.c);
        }
        throw new FileNotFoundException(bpx2.toString());
    }

    protected InputStream a(bpx bpx2, dav dav2) {
        InputStream inputStream = dav2.a(bpx2);
        return b.e() ? new brg(inputStream, bpx2, dav2.b()) : inputStream;
    }

    private void d(bpx bpx2) {
        if (bpx2.b().contains("..")) {
            throw new IOException("Invalid relative path to resource: " + bpx2);
        }
    }

    @Override
    public List b(bpx bpx2) {
        this.d(bpx2);
        ArrayList arrayList = ov.a();
        bpx bpx3 = aae.c(bpx2);
        for (dav dav2 : this.a) {
            if (!dav2.b(bpx2)) continue;
            InputStream inputStream = dav2.b(bpx3) ? this.a(bpx3, dav2) : null;
            arrayList.add(new bcv(dav2.b(), bpx2, this.a(bpx2, dav2), inputStream, this.c));
        }
        if (arrayList.isEmpty()) {
            throw new FileNotFoundException(bpx2.toString());
        }
        return arrayList;
    }

    static bpx c(bpx bpx2) {
        return new bpx(bpx2.c(), bpx2.b() + ".mcmeta");
    }

    static /* synthetic */ d b() {
        return b;
    }
}

