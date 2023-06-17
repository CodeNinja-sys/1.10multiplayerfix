/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.nj;
import com.a.a.d.ov;
import java.util.Iterator;
import java.util.List;

public abstract class bwr
implements cbg {
    protected List c = ov.a();
    private bcc a;

    @Override
    public cbg a(cbg cbg2) {
        cbg2.h().a(this.h());
        this.c.add(cbg2);
        return this;
    }

    @Override
    public List g() {
        return this.c;
    }

    @Override
    public cbg b(String string) {
        return this.a(new aym(string));
    }

    @Override
    public cbg a(bcc bcc2) {
        this.a = bcc2;
        for (cbg cbg2 : this.c) {
            cbg2.h().a(this.h());
        }
        return this;
    }

    @Override
    public bcc h() {
        if (this.a == null) {
            this.a = new bcc();
            for (cbg cbg2 : this.c) {
                cbg2.h().a(this.a);
            }
        }
        return this.a;
    }

    public Iterator iterator() {
        return nj.b((Iterator)nj.b(this), bwr.a(this.c));
    }

    @Override
    public final String i() {
        StringBuilder stringBuilder = new StringBuilder();
        for (cbg cbg2 : this) {
            stringBuilder.append(cbg2.b());
        }
        return stringBuilder.toString();
    }

    @Override
    public final String j() {
        StringBuilder stringBuilder = new StringBuilder();
        for (cbg cbg2 : this) {
            stringBuilder.append(cbg2.h().k());
            stringBuilder.append(cbg2.b());
            stringBuilder.append((Object)aug.v);
        }
        return stringBuilder.toString();
    }

    public static Iterator a(Iterable iterable) {
        Iterator iterator = nj.e(nj.a(iterable.iterator(), new cbz()));
        iterator = nj.a(iterator, new yh());
        return iterator;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof bwr) {
            bwr bwr2 = (bwr)object;
            return this.c.equals(bwr2.c) && this.h().equals(bwr2.h());
        }
        return false;
    }

    public int hashCode() {
        return 31 * this.a.hashCode() + this.c.hashCode();
    }

    public String toString() {
        return "BaseComponent{style=" + this.a + ", siblings=" + this.c + '}';
    }
}

