/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.c.a;

public class czx
implements px {
    private static final cbg a = new aym("Status request has been handled.");
    private final a b;
    private final sz c;
    private boolean d;

    public czx(a a2, sz sz2) {
        this.b = a2;
        this.c = sz2;
    }

    @Override
    public void a(cbg cbg2) {
    }

    @Override
    public void a(cqj cqj2) {
        if (this.d) {
            this.c.a(a);
            return;
        }
        this.d = true;
        this.c.a(new ctm((xr)((Object)this.b.aB())));
    }

    @Override
    public void a(j j2) {
        this.c.a(new coc(j2.a()));
        this.c.a(a);
    }
}

