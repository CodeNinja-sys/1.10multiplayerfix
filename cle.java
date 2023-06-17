/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.z;
import com.c.a.e;
import java.util.UUID;

public class cle
extends bhk {
    private final int a;
    private final boolean b;

    public cle(e e2, int n2, boolean bl2) {
        super(e2);
        this.a = n2;
        this.b = bl2;
    }

    public cle(z z2) {
        super(cle.b(z2), z2);
        this.a = z2.b("level") ? z2.c("level").j() : 0;
        this.b = z2.b("bypassesPlayerLimit") && z2.c("bypassesPlayerLimit").n();
    }

    public int c() {
        return this.a;
    }

    public boolean d() {
        return this.b;
    }

    @Override
    protected void a(z z2) {
        if (this.a() == null) {
            return;
        }
        z2.a("uuid", ((e)this.a()).a() == null ? "" : ((e)this.a()).a().toString());
        z2.a("name", ((e)this.a()).b());
        super.a(z2);
        z2.a("level", this.a);
        z2.a("bypassesPlayerLimit", this.b);
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

