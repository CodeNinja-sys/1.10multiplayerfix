/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;

public class czn
extends al
implements bme {
    private final String a;
    private final Map b = sz.c();

    public czn(String string, cbg cbg2, int n2) {
        super(cbg2, n2);
        this.a = string;
    }

    @Override
    public int c(int n2) {
        if (this.b.containsKey(n2)) {
            return (Integer)this.b.get(n2);
        }
        return 0;
    }

    @Override
    public void b(int n2, int n3) {
        this.b.put(n2, n3);
    }

    @Override
    public int f() {
        return this.b.size();
    }

    @Override
    public boolean aJ_() {
        return false;
    }

    @Override
    public void a(biu biu2) {
    }

    @Override
    public biu i() {
        return biu.a;
    }

    @Override
    public String n() {
        return this.a;
    }

    @Override
    public apq a(cps cps2, bdl bdl2) {
        throw new UnsupportedOperationException();
    }
}

