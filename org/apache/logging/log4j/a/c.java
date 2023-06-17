/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.a;

import java.lang.management.LockInfo;
import java.lang.management.MonitorInfo;
import java.lang.management.ThreadInfo;
import org.apache.logging.log4j.a.ag;
import org.apache.logging.log4j.a.d;

class c
implements ag {
    private final ThreadInfo a;

    public c(ThreadInfo threadInfo) {
        this.a = threadInfo;
    }

    @Override
    public void a(StringBuilder stringBuilder) {
        stringBuilder.append("\"").append(this.a.getThreadName()).append("\"");
        stringBuilder.append(" Id=").append(this.a.getThreadId()).append(" ");
        this.a(stringBuilder, this.a);
        if (this.a.isSuspended()) {
            stringBuilder.append(" (suspended)");
        }
        if (this.a.isInNative()) {
            stringBuilder.append(" (in native)");
        }
        stringBuilder.append('\n');
    }

    @Override
    public void a(StringBuilder stringBuilder, StackTraceElement[] arrstackTraceElement) {
        int n2 = 0;
        for (StackTraceElement stackTraceElement : arrstackTraceElement) {
            stringBuilder.append("\tat ").append(stackTraceElement.toString());
            stringBuilder.append('\n');
            if (n2 == 0 && this.a.getLockInfo() != null) {
                Object object = this.a.getThreadState();
                switch (d.a[((Enum)object).ordinal()]) {
                    case 1: {
                        stringBuilder.append("\t-  blocked on ");
                        this.a(stringBuilder, this.a.getLockInfo());
                        stringBuilder.append('\n');
                        break;
                    }
                    case 2: {
                        stringBuilder.append("\t-  waiting on ");
                        this.a(stringBuilder, this.a.getLockInfo());
                        stringBuilder.append('\n');
                        break;
                    }
                    case 3: {
                        stringBuilder.append("\t-  waiting on ");
                        this.a(stringBuilder, this.a.getLockInfo());
                        stringBuilder.append('\n');
                        break;
                    }
                }
            }
            for (MonitorInfo monitorInfo : this.a.getLockedMonitors()) {
                if (monitorInfo.getLockedStackDepth() != n2) continue;
                stringBuilder.append("\t-  locked ");
                this.a(stringBuilder, monitorInfo);
                stringBuilder.append('\n');
            }
            ++n2;
        }
        Object[] arrobject = this.a.getLockedSynchronizers();
        if (arrobject.length > 0) {
            stringBuilder.append("\n\tNumber of locked synchronizers = ").append(arrobject.length).append('\n');
            for (Object object : arrobject) {
                stringBuilder.append("\t- ");
                this.a(stringBuilder, (LockInfo)object);
                stringBuilder.append('\n');
            }
        }
    }

    private void a(StringBuilder stringBuilder, LockInfo lockInfo) {
        stringBuilder.append("<").append(lockInfo.getIdentityHashCode()).append("> (a ");
        stringBuilder.append(lockInfo.getClassName()).append(")");
    }

    private void a(StringBuilder stringBuilder, ThreadInfo threadInfo) {
        Thread.State state = threadInfo.getThreadState();
        stringBuilder.append((Object)state);
        switch (state) {
            case BLOCKED: {
                stringBuilder.append(" (on object monitor owned by \"");
                stringBuilder.append(threadInfo.getLockOwnerName()).append("\" Id=").append(threadInfo.getLockOwnerId()).append(")");
                break;
            }
            case WAITING: {
                StackTraceElement stackTraceElement = threadInfo.getStackTrace()[0];
                String string = stackTraceElement.getClassName();
                String string2 = stackTraceElement.getMethodName();
                if (string.equals("java.lang.Object") && string2.equals("wait")) {
                    stringBuilder.append(" (on object monitor");
                    if (threadInfo.getLockOwnerName() != null) {
                        stringBuilder.append(" owned by \"");
                        stringBuilder.append(threadInfo.getLockOwnerName()).append("\" Id=").append(threadInfo.getLockOwnerId());
                    }
                    stringBuilder.append(")");
                    break;
                }
                if (string.equals("java.lang.Thread") && string2.equals("join")) {
                    stringBuilder.append(" (on completion of thread ").append(threadInfo.getLockOwnerId()).append(")");
                    break;
                }
                stringBuilder.append(" (parking for lock");
                if (threadInfo.getLockOwnerName() != null) {
                    stringBuilder.append(" owned by \"");
                    stringBuilder.append(threadInfo.getLockOwnerName()).append("\" Id=").append(threadInfo.getLockOwnerId());
                }
                stringBuilder.append(")");
                break;
            }
            case TIMED_WAITING: {
                StackTraceElement stackTraceElement = threadInfo.getStackTrace()[0];
                String string = stackTraceElement.getClassName();
                String string3 = stackTraceElement.getMethodName();
                if (string.equals("java.lang.Object") && string3.equals("wait")) {
                    stringBuilder.append(" (on object monitor");
                    if (threadInfo.getLockOwnerName() != null) {
                        stringBuilder.append(" owned by \"");
                        stringBuilder.append(threadInfo.getLockOwnerName()).append("\" Id=").append(threadInfo.getLockOwnerId());
                    }
                    stringBuilder.append(")");
                    break;
                }
                if (string.equals("java.lang.Thread") && string3.equals("sleep")) {
                    stringBuilder.append(" (sleeping)");
                    break;
                }
                if (string.equals("java.lang.Thread") && string3.equals("join")) {
                    stringBuilder.append(" (on completion of thread ").append(threadInfo.getLockOwnerId()).append(")");
                    break;
                }
                stringBuilder.append(" (parking for lock");
                if (threadInfo.getLockOwnerName() != null) {
                    stringBuilder.append(" owned by \"");
                    stringBuilder.append(threadInfo.getLockOwnerName()).append("\" Id=").append(threadInfo.getLockOwnerId());
                }
                stringBuilder.append(")");
                break;
            }
        }
    }
}

