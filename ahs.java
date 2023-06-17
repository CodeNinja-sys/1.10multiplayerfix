/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

class ahs
implements awn {
    final /* synthetic */ int a;
    final /* synthetic */ ro b;

    ahs(ro ro2, int n2) {
        this.b = ro2;
        this.a = n2;
    }

    @Override
    public void a(boolean bl2, int n2) {
        List list = this.b.b.b(this.b);
        this.b.a.a(this.b.b);
        if (bl2) {
            list.remove(this.b);
            this.b.b.g().add(this.a, this.b);
        }
    }
}

