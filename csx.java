/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.a.a.d.ov;
import com.c.a.e;
import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;

public class csx
extends mn {
    @Override
    public String a() {
        return "op";
    }

    @Override
    public int b() {
        return 3;
    }

    @Override
    public String a(ala ala2) {
        return "commands.op.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        if (arrstring.length != 1 || arrstring[0].length() <= 0) {
            throw new ben("commands.op.usage", new Object[0]);
        }
        e e2 = ((bas)((Object)a2.aA())).a(arrstring[0]);
        if (e2 == null) {
            throw new kx("commands.op.failed", arrstring[0]);
        }
        ((cmt)((Object)a2.al())).b(e2);
        csx.a(ala2, (fh)this, "commands.op.success", arrstring[0]);
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1) {
            String string = arrstring[arrstring.length - 1];
            ArrayList arrayList = ov.a();
            for (GameProfile gameProfile : a2.K()) {
                if (((cmt)((Object)a2.al())).e((e)gameProfile) || !csx.a(string, gameProfile.b())) continue;
                arrayList.add(gameProfile.b());
            }
            return arrayList;
        }
        return Collections.emptyList();
    }
}

