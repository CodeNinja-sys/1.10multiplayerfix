/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.c.a;

public class cif
extends bip {
    @Override
    public String a() {
        return "defaultgamemode";
    }

    @Override
    public String a(ala ala2) {
        return "commands.defaultgamemode.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        if (arrstring.length <= 0) {
            throw new ben("commands.defaultgamemode.usage", new Object[0]);
        }
        bvh bvh2 = this.c(ala2, arrstring[0]);
        this.a(bvh2, a2);
        cif.a(ala2, (fh)this, "commands.defaultgamemode.success", new du("gameMode." + bvh2.b(), new Object[0]));
    }

    protected void a(bvh bvh2, a a2) {
        a2.a((aib)((Object)bvh2));
        if (a2.at()) {
            for (czt czt2 : ((cmt)((Object)a2.al())).u()) {
                czt2.a(bvh2);
            }
        }
    }
}

