/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.m;

class aiw
implements awp {
    final /* synthetic */ bil a;

    aiw(bil bil2) {
        this.a = bil2;
    }

    public String a() {
        String string = m.a();
        if (!string.equals("vanilla")) {
            return "Definitely; Client brand changed to '" + string + "'";
        }
        string = this.a.V();
        if (!"vanilla".equals(string)) {
            return "Definitely; Server brand changed to '" + string + "'";
        }
        if (bxy.class.getSigners() == null) {
            return "Very likely; Jar signature invalidated";
        }
        return "Probably not. Jar signature remains and both client + server brands are untouched.";
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

