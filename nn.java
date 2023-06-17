/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.z;
import com.c.a.e;
import java.util.Date;
import java.util.UUID;

public class nn
extends csu {
    public nn(e e2) {
        this(e2, null, null, null, null);
    }

    public nn(e e2, Date date, String string, Date date2, String string2) {
        super(e2, date2, string, date2, string2);
    }

    public nn(z z2) {
        super(nn.b(z2), z2);
    }

    @Override
    protected void a(z z2) {
        if (this.a() == null) {
            return;
        }
        z2.a("uuid", ((e)this.a()).a() == null ? "" : ((e)this.a()).a().toString());
        z2.a("name", ((e)this.a()).b());
        super.a(z2);
    }

    private static e b(z z2) {
        UUID uUID;
        if (!z2.b("uuid") || !z2.b("name")) {
            return null;
        }
        String string = z2.c("uuid").d();
        try {
            uUID = UUID.fromString(string);
        }
        catch (Throwable throwable) {
            return null;
        }
        return new e(uUID, z2.c("name").d());
    }
}

