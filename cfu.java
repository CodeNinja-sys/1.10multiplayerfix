/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.m;

class cfu
implements awp {
    final /* synthetic */ bxy a;

    cfu(bxy bxy2) {
        this.a = bxy2;
    }

    public String a() {
        String string = m.a();
        if (!"vanilla".equals(string)) {
            return "Definitely; Client brand changed to '" + string + "'";
        }
        if (bxy.class.getSigners() == null) {
            return "Very likely; Jar signature invalidated";
        }
        return "Probably not. Jar signature remains and client brand is untouched.";
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

