/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.z;
import com.c.a.e;
import java.util.UUID;

public class je
extends bhk {
    public je(e e2) {
        super(e2);
    }

    public je(z z2) {
        super(je.b(z2), z2);
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

