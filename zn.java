/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.z;
import java.util.Date;

public class zn
extends csu {
    public zn(String string) {
        this(string, null, null, null, null);
    }

    public zn(String string, Date date, String string2, Date date2, String string3) {
        super(string, date, string2, date2, string3);
    }

    public zn(z z2) {
        super(zn.b(z2), z2);
    }

    private static String b(z z2) {
        return z2.b("ip") ? z2.c("ip").d() : null;
    }

    @Override
    protected void a(z z2) {
        if (this.a() == null) {
            return;
        }
        z2.a("ip", (String)this.a());
        super.a(z2);
    }
}

