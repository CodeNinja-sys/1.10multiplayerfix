/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;

public class buo
extends mn {
    @Override
    public String a() {
        return "say";
    }

    @Override
    public int b() {
        return 1;
    }

    @Override
    public String a(ala ala2) {
        return "commands.say.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        if (arrstring.length <= 0 || arrstring[0].length() <= 0) {
            throw new ben("commands.say.usage", new Object[0]);
        }
        cbg cbg2 = buo.b(ala2, arrstring, 0, true);
        ((cmt)((Object)a2.al())).a(new du("chat.type.announcement", ala2.v(), cbg2));
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length >= 1) {
            return buo.a(arrstring, a2.J());
        }
        return Collections.emptyList();
    }
}

