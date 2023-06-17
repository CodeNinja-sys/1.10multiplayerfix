/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.c.a;

public class bb
extends mn {
    @Override
    public String a() {
        return "toggledownfall";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.downfall.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        this.a(a2);
        bb.a(ala2, (fh)this, "commands.downfall.success", new Object[0]);
    }

    protected void a(a a2) {
        cvn cvn2;
        cvn2.b(!(cvn2 = ((iu)((Object)a2.d[0])).E()).n());
    }
}

