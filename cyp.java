/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.c.a;
import net.minecraft.q.v;

public class cyp
extends mn {
    @Override
    public String a() {
        return "save-all";
    }

    @Override
    public String a(ala ala2) {
        return "commands.save.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        ala2.a(new du("commands.save.start", new Object[0]));
        if (a2.al() != null) {
            ((cmt)((Object)a2.al())).j();
        }
        try {
            boolean bl2;
            v v2;
            int n2;
            for (n2 = 0; n2 < a2.d.length; ++n2) {
                if (a2.d[n2] == null) continue;
                v2 = a2.d[n2];
                bl2 = ((alj)v2).G;
                ((alj)v2).G = false;
                ((alj)((Object)v2)).a(true, null);
                ((alj)v2).G = bl2;
            }
            if (arrstring.length > 0 && "flush".equals(arrstring[0])) {
                ala2.a(new du("commands.save.flushStart", new Object[0]));
                for (n2 = 0; n2 < a2.d.length; ++n2) {
                    if (a2.d[n2] == null) continue;
                    v2 = a2.d[n2];
                    bl2 = ((alj)v2).G;
                    ((alj)v2).G = false;
                    ((alj)((Object)v2)).ac();
                    ((alj)v2).G = bl2;
                }
                ala2.a(new du("commands.save.flushEnd", new Object[0]));
            }
        }
        catch (cb cb2) {
            cyp.a(ala2, (fh)this, "commands.save.failed", cb2.getMessage());
            return;
        }
        cyp.a(ala2, (fh)this, "commands.save.success", new Object[0]);
    }
}

