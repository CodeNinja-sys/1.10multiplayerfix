/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.c.a;

public class tl
extends mn {
    @Override
    public String a() {
        return "publish";
    }

    @Override
    public String a(ala ala2) {
        return "commands.publish.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        String string = a2.a((aib)((Object)bvh.b), false);
        if (string != null) {
            tl.a(ala2, (fh)this, "commands.publish.started", string);
        } else {
            tl.a(ala2, (fh)this, "commands.publish.failed", new Object[0]);
        }
    }
}

