/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.io;
import com.a.a.d.sz;
import com.a.a.d.vi;
import java.util.Collection;
import java.util.Map;

public abstract class anu {
    protected final Map b = sz.c();
    protected final Map c = new bsa();
    protected final vi d = io.v();

    public cp d(cmb cmb2) {
        return (cp)this.b.get(cmb2);
    }

    public cp b(String string) {
        return (cp)this.c.get(string);
    }

    public cp b(cmb cmb2) {
        if (this.c.containsKey(cmb2.b())) {
            throw new IllegalArgumentException("Attribute is already registered!");
        }
        cp cp2 = this.c(cmb2);
        this.c.put(cmb2.b(), cp2);
        this.b.put(cmb2, cp2);
        for (cmb cmb3 = cmb2.e(); cmb3 != null; cmb3 = cmb3.e()) {
            this.d.a(cmb3, cmb2);
        }
        return cp2;
    }

    protected abstract cp c(cmb var1);

    public Collection c() {
        return this.c.values();
    }

    public void a(cp cp2) {
    }

    public void a(vi vi2) {
        for (Map.Entry entry : vi2.l()) {
            cp cp2 = this.b((String)entry.getKey());
            if (cp2 == null) continue;
            cp2.c((cs)entry.getValue());
        }
    }

    public void b(vi vi2) {
        for (Map.Entry entry : vi2.l()) {
            cp cp2 = this.b((String)entry.getKey());
            if (cp2 == null) continue;
            cp2.c((cs)entry.getValue());
            cp2.b((cs)entry.getValue());
        }
    }
}

