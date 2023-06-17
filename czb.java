/*
 * Decompiled with CFR 0.150.
 */
import a.a.a.a.b.as;
import a.a.a.a.b.bl;
import com.a.a.d.aad;
import com.a.a.d.ov;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class czb
implements apb {
    private static final d a = org.apache.logging.log4j.c.c();
    private final Set b = aad.a();
    private final tv c;
    private final dab d;
    private final as e = new bl(8192);
    private final alj f;

    public czb(alj alj2, dab dab2, tv tv2) {
        this.f = alj2;
        this.d = dab2;
        this.c = tv2;
    }

    public Collection c() {
        return this.e.c();
    }

    public void a(bhm bhm2) {
        if (this.f.q.a(bhm2.b, bhm2.c)) {
            this.b.add(zz.a(bhm2.b, bhm2.c));
            bhm2.d = true;
        }
    }

    public void d() {
        for (bhm bhm2 : this.e.c()) {
            this.a(bhm2);
        }
    }

    @Override
    public bhm a(int n2, int n3) {
        long l2 = zz.a(n2, n3);
        bhm bhm2 = (bhm)this.e.c(l2);
        if (bhm2 != null) {
            bhm2.d = false;
        }
        return bhm2;
    }

    public bhm c(int n2, int n3) {
        bhm bhm2 = this.a(n2, n3);
        if (bhm2 == null && (bhm2 = this.e(n2, n3)) != null) {
            this.e.a(zz.a(n2, n3), bhm2);
            bhm2.e();
            bhm2.a(this, this.c);
        }
        return bhm2;
    }

    @Override
    public bhm b(int n2, int n3) {
        bhm bhm2 = this.c(n2, n3);
        if (bhm2 == null) {
            long l2 = zz.a(n2, n3);
            try {
                bhm2 = this.c.a(n2, n3);
            }
            catch (Throwable throwable) {
                cet cet2 = cet.a(throwable, "Exception generating new chunk");
                sx sx2 = cet2.a("Chunk to be generated");
                sx2.a("Location", String.format("%d,%d", n2, n3));
                sx2.a("Position hash", l2);
                sx2.a("Generator", this.c);
                throw new oz(cet2);
            }
            this.e.a(l2, bhm2);
            bhm2.e();
            bhm2.a(this, this.c);
        }
        return bhm2;
    }

    private bhm e(int n2, int n3) {
        try {
            bhm bhm2 = this.d.a(this.f, n2, n3);
            if (bhm2 != null) {
                bhm2.b(this.f.z());
                this.c.b(bhm2, n2, n3);
            }
            return bhm2;
        }
        catch (Exception exception) {
            a.b("Couldn't load chunk", (Throwable)exception);
            return null;
        }
    }

    private void b(bhm bhm2) {
        try {
            this.d.b(this.f, bhm2);
        }
        catch (Exception exception) {
            a.b("Couldn't save entities", (Throwable)exception);
        }
    }

    private void c(bhm bhm2) {
        try {
            bhm2.b(this.f.z());
            this.d.a(this.f, bhm2);
        }
        catch (IOException iOException) {
            a.b("Couldn't save chunk", (Throwable)iOException);
        }
        catch (cb cb2) {
            a.b("Couldn't save chunk; already in use by another instance of Minecraft?", (Throwable)cb2);
        }
    }

    public boolean a(boolean bl2) {
        int n2 = 0;
        ArrayList arrayList = ov.a(this.e.c());
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            bhm bhm2 = (bhm)arrayList.get(i2);
            if (bl2) {
                this.b(bhm2);
            }
            if (!bhm2.a(bl2)) continue;
            this.c(bhm2);
            bhm2.f(false);
            if (++n2 != 24 || bl2) continue;
            return false;
        }
        return true;
    }

    public void e() {
        this.d.c();
    }

    @Override
    public boolean a() {
        if (!this.f.G) {
            if (!this.b.isEmpty()) {
                Iterator iterator = this.b.iterator();
                int n2 = 0;
                while (n2 < 100 && iterator.hasNext()) {
                    Long l2 = (Long)iterator.next();
                    bhm bhm2 = (bhm)this.e.get(l2);
                    if (bhm2 != null && bhm2.d) {
                        bhm2.f();
                        this.c(bhm2);
                        this.b(bhm2);
                        this.e.remove(l2);
                        ++n2;
                    }
                    iterator.remove();
                }
            }
            this.d.b();
        }
        return false;
    }

    public boolean f() {
        return !this.f.G;
    }

    @Override
    public String b() {
        return "ServerChunkCache: " + this.e.size() + " Drop: " + this.b.size();
    }

    public List a(nx nx2, cmz cmz2) {
        return this.c.a(nx2, cmz2);
    }

    public cmz a(iu iu2, String string, cmz cmz2) {
        return this.c.a(iu2, string, cmz2);
    }

    public int g() {
        return this.e.size();
    }

    public boolean d(int n2, int n3) {
        return this.e.b(zz.a(n2, n3));
    }
}

