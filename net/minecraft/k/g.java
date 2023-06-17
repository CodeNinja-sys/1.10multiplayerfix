/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.k;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.List;
import net.minecraft.k.a;
import net.minecraft.k.p;

class g
implements p {
    final /* synthetic */ a a;

    g(a a2) {
        this.a = a2;
    }

    public String a() {
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        List<String> list = runtimeMXBean.getInputArguments();
        int n2 = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : list) {
            if (!string.startsWith("-X")) continue;
            if (n2++ > 0) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(string);
        }
        return String.format("%d total; %s", n2, stringBuilder.toString());
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

