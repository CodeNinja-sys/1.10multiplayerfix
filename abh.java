/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class abh
extends anu {
    private final Set e = aad.a();
    protected final Map a = new bsa();

    public cym a(cmb cmb2) {
        return (cym)super.d(cmb2);
    }

    public cym a(String string) {
        cp cp2 = super.b(string);
        if (cp2 == null) {
            cp2 = (cp)this.a.get(string);
        }
        return (cym)cp2;
    }

    @Override
    public cp b(cmb cmb2) {
        cp cp2 = super.b(cmb2);
        if (cmb2 instanceof ot && ((ot)cmb2).a() != null) {
            this.a.put(((ot)cmb2).a(), cp2);
        }
        return cp2;
    }

    @Override
    protected cp c(cmb cmb2) {
        return new cym(this, cmb2);
    }

    @Override
    public void a(cp cp2) {
        if (cp2.a().d()) {
            this.e.add(cp2);
        }
        for (cmb cmb2 : this.d.c(cp2.a())) {
            cym cym2 = this.a(cmb2);
            if (cym2 == null) continue;
            cym2.f();
        }
    }

    public Set a() {
        return this.e;
    }

    public Collection b() {
        HashSet hashSet = aad.a();
        for (cp cp2 : this.c()) {
            if (!cp2.a().d()) continue;
            hashSet.add(cp2);
        }
        return hashSet;
    }

    @Override
    public /* synthetic */ cp b(String string) {
        return this.a(string);
    }

    @Override
    public /* synthetic */ cp d(cmb cmb2) {
        return this.a(cmb2);
    }
}

