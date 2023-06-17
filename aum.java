/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import com.a.a.d.sz;
import com.a.b.k;
import com.a.b.r;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class aum {
    static final k a = new r().a((Type)((Object)aum.class), (Object)new dcu()).a((Type)((Object)cbn.class), (Object)new aso()).a((Type)((Object)agm.class), (Object)new rc()).a((Type)((Object)clu.class), (Object)new ea()).a((Type)((Object)bey.class), (Object)new ads()).i();
    private final Map b = sz.c();
    private clu c;

    public static aum a(Reader reader) {
        return (aum)a.a(reader, aum.class);
    }

    public aum(Map map, clu clu2) {
        this.c = clu2;
        this.b.putAll(map);
    }

    public aum(List list) {
        aum aum2 = null;
        for (aum aum3 : list) {
            if (aum3.b()) {
                this.b.clear();
                aum2 = aum3;
            }
            this.b.putAll(aum3.b);
        }
        if (aum2 != null) {
            this.c = aum2.c;
        }
    }

    public boolean a(String string) {
        return this.b.get(string) != null;
    }

    public agm b(String string) {
        agm agm2 = (agm)this.b.get(string);
        if (agm2 == null) {
            throw new dfv(this);
        }
        return agm2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof aum) {
            aum aum2 = (aum)object;
            if (this.b.equals(aum2.b)) {
                return this.b() ? this.c.equals(aum2.c) : !aum2.b();
            }
        }
        return false;
    }

    public int hashCode() {
        return 31 * this.b.hashCode() + (this.b() ? this.c.hashCode() : 0);
    }

    public Set a() {
        HashSet hashSet = aad.b(this.b.values());
        if (this.b()) {
            hashSet.addAll(this.c.b());
        }
        return hashSet;
    }

    public boolean b() {
        return this.c != null;
    }

    public clu c() {
        return this.c;
    }
}

