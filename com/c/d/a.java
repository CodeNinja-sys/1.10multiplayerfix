/*
 * Decompiled with CFR 0.150.
 */
package com.c.d;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.apache.logging.log4j.core.d;
import org.apache.logging.log4j.core.f;
import org.apache.logging.log4j.core.g.g;
import org.apache.logging.log4j.core.h;

public class a
extends org.apache.logging.log4j.core.a.a {
    private static final int a = 250;
    private static final Map b = new HashMap();
    private static final ReadWriteLock c = new ReentrantReadWriteLock();
    private final BlockingQueue d;

    public a(String string, d d2, f f2, boolean bl2, BlockingQueue blockingQueue) {
        super(string, d2, f2, bl2);
        this.d = blockingQueue;
    }

    @Override
    public void a(h h2) {
        if (this.d.size() >= 250) {
            this.d.clear();
        }
        this.d.add(this.b().b(h2).toString());
    }

    public static a a(String string, String string2, f f2, d d2, String string3) {
        boolean bl2 = Boolean.parseBoolean(string2);
        if (string == null) {
            h.b("No name provided for QueueLogAppender");
            return null;
        }
        if (string3 == null) {
            string3 = string;
        }
        c.writeLock().lock();
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue)b.get(string3);
        if (linkedBlockingQueue == null) {
            linkedBlockingQueue = new LinkedBlockingQueue();
            b.put(string3, linkedBlockingQueue);
        }
        c.writeLock().unlock();
        if (f2 == null) {
            f2 = g.a(null, null, null, null, null);
        }
        return new a(string, d2, f2, bl2, linkedBlockingQueue);
    }

    public static String a(String string) {
        c.readLock().lock();
        BlockingQueue blockingQueue = (BlockingQueue)b.get(string);
        c.readLock().unlock();
        if (blockingQueue != null) {
            try {
                return (String)blockingQueue.take();
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
        }
        return null;
    }
}

