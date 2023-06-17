/*
 * Decompiled with CFR 0.150.
 */
import com.c.a.e;
import java.net.SocketAddress;
import net.minecraft.c.a;

public class afr
extends cmt {
    private bvp f;

    public afr(bil bil2) {
        super(bil2);
        this.a(10);
    }

    @Override
    protected void a(czt czt2) {
        if (czt2.i_().equals(this.a().Q())) {
            this.f = czt2.e(new bvp());
        }
        super.a(czt2);
    }

    @Override
    public String a(SocketAddress socketAddress, e e2) {
        if (e2.b().equalsIgnoreCase(this.a().Q()) && this.a(e2.b()) != null) {
            return "That name is already taken.";
        }
        return super.a(socketAddress, e2);
    }

    public bil a() {
        return (bil)super.c();
    }

    @Override
    public bvp b() {
        return this.f;
    }

    @Override
    public /* synthetic */ a c() {
        return this.a();
    }
}

