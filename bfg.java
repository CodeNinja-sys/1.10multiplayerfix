/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import com.a.b.k;
import com.a.b.r;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class bfg {
    private static final d f = org.apache.logging.log4j.c.c();
    static final k a = new r().a((Type)((Object)bfg.class), (Object)new cnk()).a((Type)((Object)vo.class), (Object)new lg()).a((Type)((Object)cvf.class), (Object)new bsk()).a((Type)((Object)bnx.class), (Object)new cdn()).a((Type)((Object)cll.class), (Object)new clk()).a((Type)((Object)dfk.class), (Object)new btd()).a((Type)((Object)mh.class), (Object)new cwb()).i();
    private final List g;
    private final boolean h;
    private final boolean i;
    private final dfk j;
    private final List k;
    public String b = "";
    protected final Map c;
    protected bfg d;
    protected bpx e;

    public static bfg a(Reader reader) {
        return (bfg)cwe.a(a, reader, bfg.class, false);
    }

    public static bfg a(String string) {
        return bfg.a(new StringReader(string));
    }

    public bfg(bpx bpx2, List list, Map map, boolean bl2, boolean bl3, dfk dfk2, List list2) {
        this.g = list;
        this.i = bl2;
        this.h = bl3;
        this.c = map;
        this.e = bpx2;
        this.j = dfk2;
        this.k = list2;
    }

    public List a() {
        if (this.g.isEmpty() && this.k()) {
            return this.d.a();
        }
        return this.g;
    }

    private boolean k() {
        return this.d != null;
    }

    public boolean b() {
        if (this.k()) {
            return this.d.b();
        }
        return this.i;
    }

    public boolean c() {
        return this.h;
    }

    public boolean d() {
        return this.e == null || this.d != null && this.d.d();
    }

    public void a(Map map) {
        if (this.e != null) {
            this.d = (bfg)map.get(this.e);
        }
    }

    public Collection e() {
        HashSet hashSet = aad.a();
        for (mh mh2 : this.k) {
            hashSet.add(mh2.a());
        }
        return hashSet;
    }

    protected List f() {
        return this.k;
    }

    public clv g() {
        if (this.k.isEmpty()) {
            return clv.a;
        }
        return new clv(this.k);
    }

    public boolean b(String string) {
        return !"missingno".equals(this.c(string));
    }

    public String c(String string) {
        if (!this.d(string)) {
            string = '#' + string;
        }
        return this.a(string, new agp(this, null));
    }

    private String a(String string, agp agp2) {
        if (this.d(string)) {
            if (this == agp2.b) {
                f.f("Unable to resolve texture due to upward reference: {} in {}", string, this.b);
                return "missingno";
            }
            String string2 = (String)this.c.get(string.substring(1));
            if (string2 == null && this.k()) {
                string2 = this.d.a(string, agp2);
            }
            agp2.b = this;
            if (string2 != null && this.d(string2)) {
                string2 = agp2.a.a(string2, agp2);
            }
            if (string2 == null || this.d(string2)) {
                return "missingno";
            }
            return string2;
        }
        return string;
    }

    private boolean d(String string) {
        return string.charAt(0) == '#';
    }

    public bpx h() {
        return this.e;
    }

    public bfg i() {
        return this.k() ? this.d.i() : this;
    }

    public dfk j() {
        cll cll2 = this.a(cua.b);
        cll cll3 = this.a(cua.c);
        cll cll4 = this.a(cua.d);
        cll cll5 = this.a(cua.e);
        cll cll6 = this.a(cua.f);
        cll cll7 = this.a(cua.g);
        cll cll8 = this.a(cua.h);
        cll cll9 = this.a(cua.i);
        return new dfk(cll2, cll3, cll4, cll5, cll6, cll7, cll8, cll9);
    }

    private cll a(cua cua2) {
        if (this.d != null && !this.j.c(cua2)) {
            return this.d.a(cua2);
        }
        return this.j.b(cua2);
    }

    public static void b(Map map) {
        for (bfg bfg2 : map.values()) {
            try {
                bfg bfg3 = bfg2.d;
                bfg bfg4 = bfg3.d;
                while (bfg3 != bfg4) {
                    bfg3 = bfg3.d;
                    bfg4 = bfg4.d.d;
                }
                throw new bgm();
            }
            catch (NullPointerException nullPointerException) {
            }
        }
    }
}

