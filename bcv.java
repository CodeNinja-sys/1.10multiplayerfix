/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import com.a.b.ab;
import com.a.b.z;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Map;
import org.apache.commons.b.t;

public class bcv
implements dbr,
Closeable {
    private final Map a = sz.c();
    private final String b;
    private final bpx c;
    private final InputStream d;
    private final InputStream e;
    private final a f;
    private boolean g;
    private z h;

    public bcv(String string, bpx bpx2, InputStream inputStream, InputStream inputStream2, a a2) {
        this.b = string;
        this.c = bpx2;
        this.d = inputStream;
        this.e = inputStream2;
        this.f = a2;
    }

    @Override
    public bpx a() {
        return this.c;
    }

    @Override
    public InputStream b() {
        return this.d;
    }

    @Override
    public boolean c() {
        return this.e != null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public bzj a(String string) {
        Object object;
        if (!this.c()) {
            return null;
        }
        if (this.h == null && !this.g) {
            this.g = true;
            object = null;
            try {
                object = new BufferedReader(new InputStreamReader(this.e));
                this.h = new ab().a((Reader)object).t();
            }
            finally {
                t.a((Reader)object);
            }
        }
        if ((object = (bzj)this.a.get(string)) == null) {
            object = this.f.a(string, this.h);
        }
        return object;
    }

    @Override
    public String d() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof bcv)) {
            return false;
        }
        bcv bcv2 = (bcv)object;
        if (this.c != null ? !this.c.equals(bcv2.c) : bcv2.c != null) {
            return false;
        }
        return !(this.b != null ? !this.b.equals(bcv2.b) : bcv2.b != null);
    }

    public int hashCode() {
        int n2 = this.b != null ? this.b.hashCode() : 0;
        n2 = 31 * n2 + (this.c != null ? this.c.hashCode() : 0);
        return n2;
    }

    @Override
    public void close() {
        this.d.close();
        if (this.e != null) {
            this.e.close();
        }
    }
}

