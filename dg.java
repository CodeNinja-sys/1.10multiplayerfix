/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.z;
import com.c.a.e;
import java.io.File;

public class dg
extends aic {
    public dg(File file) {
        super(file);
    }

    @Override
    protected bhk a(z z2) {
        return new nn(z2);
    }

    public boolean a(e e2) {
        return this.d(e2);
    }

    @Override
    public String[] a() {
        String[] arrstring = new String[this.c().size()];
        int n2 = 0;
        for (nn nn2 : this.c().values()) {
            arrstring[n2++] = ((e)nn2.a()).b();
        }
        return arrstring;
    }

    protected String b(e e2) {
        return e2.a().toString();
    }

    public e a(String string) {
        for (nn nn2 : this.c().values()) {
            if (!string.equalsIgnoreCase(((e)nn2.a()).b())) continue;
            return (e)nn2.a();
        }
        return null;
    }

    @Override
    protected /* synthetic */ String a(Object object) {
        return this.b((e)object);
    }
}

