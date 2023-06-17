/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.z;
import com.c.a.e;
import java.io.File;

public class cto
extends aic {
    public cto(File file) {
        super(file);
    }

    @Override
    protected bhk a(z z2) {
        return new je(z2);
    }

    @Override
    public String[] a() {
        String[] arrstring = new String[this.c().size()];
        int n2 = 0;
        for (je je2 : this.c().values()) {
            arrstring[n2++] = ((e)je2.a()).b();
        }
        return arrstring;
    }

    protected String a(e e2) {
        return e2.a().toString();
    }

    public e a(String string) {
        for (je je2 : this.c().values()) {
            if (!string.equalsIgnoreCase(((e)je2.a()).b())) continue;
            return (e)je2.a();
        }
        return null;
    }

    @Override
    protected /* synthetic */ String a(Object object) {
        return this.a((e)object);
    }
}

