/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.a;

import org.apache.logging.log4j.a.ag;

class b
implements ag {
    private static final int a = 32;
    private static final int b = 31;
    private final long c;
    private final String d;
    private final String e;
    private final Thread.State f;
    private final int g;
    private final boolean h;
    private final boolean i;
    private final String j;

    public b(Thread thread) {
        this.c = thread.getId();
        this.d = thread.getName();
        this.e = thread.toString();
        this.f = thread.getState();
        this.g = thread.getPriority();
        this.h = thread.isAlive();
        this.i = thread.isDaemon();
        ThreadGroup threadGroup = thread.getThreadGroup();
        this.j = threadGroup == null ? null : threadGroup.getName();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        b b2 = (b)object;
        if (this.c != b2.c) {
            return false;
        }
        return !(this.d != null ? !this.d.equals(b2.d) : b2.d != null);
    }

    public int hashCode() {
        int n2 = (int)(this.c ^ this.c >>> 32);
        n2 = 31 * n2 + (this.d != null ? this.d.hashCode() : 0);
        return n2;
    }

    @Override
    public void a(StringBuilder stringBuilder) {
        stringBuilder.append("\"").append(this.d).append("\" ");
        if (this.i) {
            stringBuilder.append("daemon ");
        }
        stringBuilder.append("prio=").append(this.g).append(" tid=").append(this.c).append(" ");
        if (this.j != null) {
            stringBuilder.append("group=\"").append(this.j).append("\"");
        }
        stringBuilder.append("\n");
        stringBuilder.append("\tThread state: ").append(this.f.name()).append("\n");
    }

    @Override
    public void a(StringBuilder stringBuilder, StackTraceElement[] arrstackTraceElement) {
        for (StackTraceElement stackTraceElement : arrstackTraceElement) {
            stringBuilder.append("\tat ").append(stackTraceElement).append("\n");
        }
    }
}

