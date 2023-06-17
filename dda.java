/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.z;
import com.c.a.e;
import java.io.File;

public class dda
extends aic {
    public dda(File file) {
        super(file);
    }

    @Override
    protected bhk a(z z2) {
        return new cle(z2);
    }

    @Override
    public String[] a() {
        String[] arrstring = new String[this.c().size()];
        int n2 = 0;
        for (cle cle2 : this.c().values()) {
            arrstring[n2++] = ((e)cle2.a()).b();
        }
        return arrstring;
    }

    public int a(e e2) {
        cle cle2 = (cle)this.b((Object)e2);
        if (cle2 != null) {
            return cle2.c();
        }
        return 0;
    }

    public boolean b(e e2) {
        cle cle2 = (cle)this.b((Object)e2);
        if (cle2 != null) {
            return cle2.d();
        }
        return false;
    }

    protected String c(e e2) {
        return e2.a().toString();
    }

    public e a(String string) {
        for (cle cle2 : this.c().values()) {
            if (!string.equalsIgnoreCase(((e)cle2.a()).b())) continue;
            return (e)cle2.a();
        }
        return null;
    }

    @Override
    protected /* synthetic */ String a(Object object) {
        return this.c((e)object);
    }
}

