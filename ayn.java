/*
 * Decompiled with CFR 0.150.
 */
import com.c.a.e;
import com.c.a.i;
import java.util.List;
import net.minecraft.c.a;

final class ayn
implements i {
    final /* synthetic */ a a;
    final /* synthetic */ List b;

    ayn(a a2, List list) {
        this.a = a2;
        this.b = list;
    }

    @Override
    public void a(e e2) {
        ((bas)((Object)this.a.aA())).a(e2);
        this.b.add(e2);
    }

    @Override
    public void a(e e2, Exception exception) {
        dee.a().f("Could not lookup user whitelist entry for {}", e2.b(), exception);
    }
}

