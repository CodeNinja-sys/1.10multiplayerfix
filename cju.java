/*
 * Decompiled with CFR 0.150.
 */
import java.io.File;
import java.io.FilenameFilter;

class cju
implements FilenameFilter {
    final /* synthetic */ avn a;

    cju(avn avn2) {
        this.a = avn2;
    }

    @Override
    public boolean accept(File file, String string) {
        return string.endsWith(".mcr");
    }
}

