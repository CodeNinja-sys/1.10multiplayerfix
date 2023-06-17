/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import net.minecraft.c.a;

public class ats
extends bzt {
    private final a a;
    private final Set b = aad.a();
    private Runnable[] c = new Runnable[0];

    public ats(a a2) {
        this.a = a2;
    }

    @Override
    public void a(czu czu2) {
        super.a(czu2);
        if (this.b.contains(czu2.c())) {
            ((cmt)((Object)this.a.al())).a(new cnr(czu2));
        }
        this.a();
    }

    @Override
    public void a(String string) {
        super.a(string);
        ((cmt)((Object)this.a.al())).a(new cnr(string));
        this.a();
    }

    @Override
    public void a(String string, bhi bhi2) {
        super.a(string, bhi2);
        ((cmt)((Object)this.a.al())).a(new cnr(string, bhi2));
        this.a();
    }

    @Override
    public void a(int n2, bhi bhi2) {
        bhi bhi3 = this.a(n2);
        super.a(n2, bhi2);
        if (bhi3 != bhi2 && bhi3 != null) {
            if (this.h(bhi3) > 0) {
                ((cmt)((Object)this.a.al())).a(new cnc(n2, bhi2));
            } else {
                this.g(bhi3);
            }
        }
        if (bhi2 != null) {
            if (this.b.contains(bhi2)) {
                ((cmt)((Object)this.a.al())).a(new cnc(n2, bhi2));
            } else {
                this.e(bhi2);
            }
        }
        this.a();
    }

    @Override
    public boolean a(String string, String string2) {
        if (super.a(string, string2)) {
            ef ef2 = this.d(string2);
            ((cmt)((Object)this.a.al())).a(new bvn(ef2, Arrays.asList(string), 3));
            this.a();
            return true;
        }
        return false;
    }

    @Override
    public void a(String string, ef ef2) {
        super.a(string, ef2);
        ((cmt)((Object)this.a.al())).a(new bvn(ef2, Arrays.asList(string), 4));
        this.a();
    }

    @Override
    public void a(bhi bhi2) {
        super.a(bhi2);
        this.a();
    }

    @Override
    public void b(bhi bhi2) {
        super.b(bhi2);
        if (this.b.contains(bhi2)) {
            ((cmt)((Object)this.a.al())).a(new dbi(bhi2, 2));
        }
        this.a();
    }

    @Override
    public void c(bhi bhi2) {
        super.c(bhi2);
        if (this.b.contains(bhi2)) {
            this.g(bhi2);
        }
        this.a();
    }

    @Override
    public void a(ef ef2) {
        super.a(ef2);
        ((cmt)((Object)this.a.al())).a(new bvn(ef2, 0));
        this.a();
    }

    @Override
    public void b(ef ef2) {
        super.b(ef2);
        ((cmt)((Object)this.a.al())).a(new bvn(ef2, 2));
        this.a();
    }

    @Override
    public void c(ef ef2) {
        super.c(ef2);
        ((cmt)((Object)this.a.al())).a(new bvn(ef2, 1));
        this.a();
    }

    public void a(Runnable runnable) {
        this.c = Arrays.copyOf(this.c, this.c.length + 1);
        this.c[this.c.length - 1] = runnable;
    }

    protected void a() {
        for (Runnable runnable : this.c) {
            runnable.run();
        }
    }

    public List d(bhi bhi2) {
        ArrayList arrayList = ov.a();
        arrayList.add(new dbi(bhi2, 0));
        for (int i2 = 0; i2 < 19; ++i2) {
            if (this.a(i2) != bhi2) continue;
            arrayList.add(new cnc(i2, bhi2));
        }
        for (czu czu2 : this.i(bhi2)) {
            arrayList.add(new cnr(czu2));
        }
        return arrayList;
    }

    public void e(bhi bhi2) {
        List list = this.d(bhi2);
        for (czt czt2 : ((cmt)((Object)this.a.al())).u()) {
            for (ds ds2 : list) {
                czt2.a.a(ds2);
            }
        }
        this.b.add(bhi2);
    }

    public List f(bhi bhi2) {
        ArrayList arrayList = ov.a();
        arrayList.add(new dbi(bhi2, 1));
        for (int i2 = 0; i2 < 19; ++i2) {
            if (this.a(i2) != bhi2) continue;
            arrayList.add(new cnc(i2, bhi2));
        }
        return arrayList;
    }

    public void g(bhi bhi2) {
        List list = this.f(bhi2);
        for (czt czt2 : ((cmt)((Object)this.a.al())).u()) {
            for (ds ds2 : list) {
                czt2.a.a(ds2);
            }
        }
        this.b.remove(bhi2);
    }

    public int h(bhi bhi2) {
        int n2 = 0;
        for (int i2 = 0; i2 < 19; ++i2) {
            if (this.a(i2) != bhi2) continue;
            ++n2;
        }
        return n2;
    }
}

