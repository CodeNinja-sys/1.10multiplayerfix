/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;
import org.apache.commons.c.am;

public abstract class ahg {
    protected final cld a;
    protected final boolean b;
    protected boolean c;
    protected boolean d;
    protected int e;
    protected List f = ov.a();

    public ahg(cld cld2, boolean bl2) {
        this.a = cld2;
        this.b = bl2;
    }

    public void a() {
        if (this.c) {
            this.a.b(0);
            this.a.b(this.a.a(-1, this.a.i(), false) - this.a.i());
            if (this.e >= this.f.size()) {
                this.e = 0;
            }
        } else {
            int n2 = this.a.a(-1, this.a.i(), false);
            this.f.clear();
            this.e = 0;
            String string = this.a.b().substring(0, this.a.i());
            this.a(string);
            if (this.f.isEmpty()) {
                return;
            }
            this.c = true;
            this.a.b(n2 - this.a.i());
        }
        this.a.b((String)this.f.get(this.e++));
    }

    private void a(String string) {
        if (string.length() < 1) {
            return;
        }
        bxy.B().h.a.a(new aas(string, this.b(), this.b));
        this.d = true;
    }

    public abstract cmz b();

    public void a(String ... arrstring) {
        if (!this.d) {
            return;
        }
        this.c = false;
        this.f.clear();
        for (String string : arrstring) {
            if (string.isEmpty()) continue;
            this.f.add(string);
        }
        String string = this.a.b().substring(this.a.a(-1, this.a.i(), false));
        String string2 = am.b(arrstring);
        if (!string2.isEmpty() && !string.equalsIgnoreCase(string2)) {
            this.a.b(0);
            this.a.b(this.a.a(-1, this.a.i(), false) - this.a.i());
            this.a.b(string2);
        } else if (!this.f.isEmpty()) {
            this.c = true;
            this.a();
        }
    }

    public void c() {
        this.c = false;
    }

    public void d() {
        this.d = false;
    }
}

