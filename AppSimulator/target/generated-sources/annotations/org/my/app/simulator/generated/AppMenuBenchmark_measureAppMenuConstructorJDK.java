package org.my.app.simulator.generated;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Collection;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;
import org.openjdk.jmh.annotations.CompilerControl;
import org.openjdk.jmh.runner.InfraControl;
import org.openjdk.jmh.infra.ThreadParams;
import org.openjdk.jmh.results.Result;
import org.openjdk.jmh.results.ThroughputResult;
import org.openjdk.jmh.results.AverageTimeResult;
import org.openjdk.jmh.results.SampleTimeResult;
import org.openjdk.jmh.results.SingleShotResult;
import org.openjdk.jmh.util.SampleBuffer;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Threads;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.results.RawResults;
import org.openjdk.jmh.results.ResultRole;
import java.lang.reflect.Field;
import org.openjdk.jmh.infra.BenchmarkParams;
import org.openjdk.jmh.infra.IterationParams;

import org.my.app.simulator.generated.AppMenuBenchmark_jmh;
import org.openjdk.jmh.infra.generated.Blackhole_jmh;
@Generated("org.openjdk.jmh.generators.core.BenchmarkGenerator")
public final class AppMenuBenchmark_measureAppMenuConstructorJDK {

    boolean p000, p001, p002, p003, p004, p005, p006, p007, p008, p009, p010, p011, p012, p013, p014, p015;
    boolean p016, p017, p018, p019, p020, p021, p022, p023, p024, p025, p026, p027, p028, p029, p030, p031;
    boolean p032, p033, p034, p035, p036, p037, p038, p039, p040, p041, p042, p043, p044, p045, p046, p047;
    boolean p048, p049, p050, p051, p052, p053, p054, p055, p056, p057, p058, p059, p060, p061, p062, p063;
    boolean p064, p065, p066, p067, p068, p069, p070, p071, p072, p073, p074, p075, p076, p077, p078, p079;
    boolean p080, p081, p082, p083, p084, p085, p086, p087, p088, p089, p090, p091, p092, p093, p094, p095;
    boolean p096, p097, p098, p099, p100, p101, p102, p103, p104, p105, p106, p107, p108, p109, p110, p111;
    boolean p112, p113, p114, p115, p116, p117, p118, p119, p120, p121, p122, p123, p124, p125, p126, p127;
    boolean p128, p129, p130, p131, p132, p133, p134, p135, p136, p137, p138, p139, p140, p141, p142, p143;
    boolean p144, p145, p146, p147, p148, p149, p150, p151, p152, p153, p154, p155, p156, p157, p158, p159;
    boolean p160, p161, p162, p163, p164, p165, p166, p167, p168, p169, p170, p171, p172, p173, p174, p175;
    boolean p176, p177, p178, p179, p180, p181, p182, p183, p184, p185, p186, p187, p188, p189, p190, p191;
    boolean p192, p193, p194, p195, p196, p197, p198, p199, p200, p201, p202, p203, p204, p205, p206, p207;
    boolean p208, p209, p210, p211, p212, p213, p214, p215, p216, p217, p218, p219, p220, p221, p222, p223;
    boolean p224, p225, p226, p227, p228, p229, p230, p231, p232, p233, p234, p235, p236, p237, p238, p239;
    boolean p240, p241, p242, p243, p244, p245, p246, p247, p248, p249, p250, p251, p252, p253, p254, p255;
    int startRndMask;

    public Collection<ThroughputResult> measureAppMenuConstructorJDK_Throughput(InfraControl control, ThreadParams threadParams) throws Throwable {
        if (threadParams.getSubgroupIndex() == 0) {
            Blackhole_jmh l_blackhole1_1 = _jmh_tryInit_f_blackhole1_1(control, threadParams);
            AppMenuBenchmark_jmh l_appmenubenchmark0_0 = _jmh_tryInit_f_appmenubenchmark0_0(control, threadParams);

            control.preSetup();
            if (!l_blackhole1_1.readyIteration) {
                l_blackhole1_1.clearSinks();
                l_blackhole1_1.readyIteration = true;
            }

            control.announceWarmupReady();
            while (control.warmupShouldWait) {
                l_appmenubenchmark0_0.measureAppMenuConstructorJDK();
            }

            RawResults res = new RawResults(control.benchmarkParams.getOpsPerInvocation());
            measureAppMenuConstructorJDK_thrpt_jmhStub(control, res, l_appmenubenchmark0_0, l_blackhole1_1);
            res.operations /= control.iterationParams.getBatchSize();
            control.announceWarmdownReady();
            try {
                while (control.warmdownShouldWait) {
                    l_appmenubenchmark0_0.measureAppMenuConstructorJDK();
                }
                control.preTearDown();
            } catch (InterruptedException ie) {
                control.preTearDownForce();
            }
            if (l_blackhole1_1.readyIteration) {
                l_blackhole1_1.readyIteration = false;
            }

            if (control.isLastIteration()) {
                f_appmenubenchmark0_0 = null;
                f_blackhole1_1 = null;
            }
            Collection<ThroughputResult> results = new ArrayList<ThroughputResult>();
            results.add(new ThroughputResult(ResultRole.PRIMARY, "measureAppMenuConstructorJDK", res.getOperations(), res.getTime(), control.benchmarkParams.getTimeUnit()));
            return results;
        } else
            throw new IllegalStateException("Harness failed to distribute threads among groups properly");
    }

    public void measureAppMenuConstructorJDK_thrpt_jmhStub(InfraControl control, RawResults result, AppMenuBenchmark_jmh l_appmenubenchmark0_0, Blackhole_jmh l_blackhole1_1) throws Throwable {
        long operations = 0;
        long realTime = 0;
        result.startTime = System.nanoTime();
        do {
            l_appmenubenchmark0_0.measureAppMenuConstructorJDK();
            operations++;
        } while(!control.isDone);
        result.stopTime = System.nanoTime();
        result.realTime = realTime;
        result.operations = operations;
    }


    public Collection<AverageTimeResult> measureAppMenuConstructorJDK_AverageTime(InfraControl control, ThreadParams threadParams) throws Throwable {
        if (threadParams.getSubgroupIndex() == 0) {
            Blackhole_jmh l_blackhole1_1 = _jmh_tryInit_f_blackhole1_1(control, threadParams);
            AppMenuBenchmark_jmh l_appmenubenchmark0_0 = _jmh_tryInit_f_appmenubenchmark0_0(control, threadParams);

            control.preSetup();
            if (!l_blackhole1_1.readyIteration) {
                l_blackhole1_1.clearSinks();
                l_blackhole1_1.readyIteration = true;
            }

            control.announceWarmupReady();
            while (control.warmupShouldWait) {
                l_appmenubenchmark0_0.measureAppMenuConstructorJDK();
            }

            RawResults res = new RawResults(control.benchmarkParams.getOpsPerInvocation());
            measureAppMenuConstructorJDK_avgt_jmhStub(control, res, l_appmenubenchmark0_0, l_blackhole1_1);
            res.operations /= control.iterationParams.getBatchSize();
            control.announceWarmdownReady();
            try {
                while (control.warmdownShouldWait) {
                    l_appmenubenchmark0_0.measureAppMenuConstructorJDK();
                }
                control.preTearDown();
            } catch (InterruptedException ie) {
                control.preTearDownForce();
            }
            if (l_blackhole1_1.readyIteration) {
                l_blackhole1_1.readyIteration = false;
            }

            if (control.isLastIteration()) {
                f_appmenubenchmark0_0 = null;
                f_blackhole1_1 = null;
            }
            Collection<AverageTimeResult> results = new ArrayList<AverageTimeResult>();
            results.add(new AverageTimeResult(ResultRole.PRIMARY, "measureAppMenuConstructorJDK", res.getOperations(), res.getTime(), control.benchmarkParams.getTimeUnit()));
            return results;
        } else
            throw new IllegalStateException("Harness failed to distribute threads among groups properly");
    }

    public void measureAppMenuConstructorJDK_avgt_jmhStub(InfraControl control, RawResults result, AppMenuBenchmark_jmh l_appmenubenchmark0_0, Blackhole_jmh l_blackhole1_1) throws Throwable {
        long operations = 0;
        long realTime = 0;
        result.startTime = System.nanoTime();
        do {
            l_appmenubenchmark0_0.measureAppMenuConstructorJDK();
            operations++;
        } while(!control.isDone);
        result.stopTime = System.nanoTime();
        result.realTime = realTime;
        result.operations = operations;
    }


    public Collection<SampleTimeResult> measureAppMenuConstructorJDK_SampleTime(InfraControl control, ThreadParams threadParams) throws Throwable {
        if (threadParams.getSubgroupIndex() == 0) {
            Blackhole_jmh l_blackhole1_1 = _jmh_tryInit_f_blackhole1_1(control, threadParams);
            AppMenuBenchmark_jmh l_appmenubenchmark0_0 = _jmh_tryInit_f_appmenubenchmark0_0(control, threadParams);

            control.preSetup();
            if (!l_blackhole1_1.readyIteration) {
                l_blackhole1_1.clearSinks();
                l_blackhole1_1.readyIteration = true;
            }

            control.announceWarmupReady();
            while (control.warmupShouldWait) {
                l_appmenubenchmark0_0.measureAppMenuConstructorJDK();
            }

            int targetSamples = (int) (control.getDuration(TimeUnit.MILLISECONDS) * 20); // at max, 20 timestamps per millisecond
            int batchSize = control.iterationParams.getBatchSize();
            SampleBuffer buffer = new SampleBuffer();
            measureAppMenuConstructorJDK_sample_jmhStub(control, buffer, targetSamples, control.benchmarkParams.getOpsPerInvocation(), batchSize, l_appmenubenchmark0_0, l_blackhole1_1);
            control.announceWarmdownReady();
            try {
                while (control.warmdownShouldWait) {
                    l_appmenubenchmark0_0.measureAppMenuConstructorJDK();
                }
                control.preTearDown();
            } catch (InterruptedException ie) {
                control.preTearDownForce();
            }
            if (l_blackhole1_1.readyIteration) {
                l_blackhole1_1.readyIteration = false;
            }

            if (control.isLastIteration()) {
                f_appmenubenchmark0_0 = null;
                f_blackhole1_1 = null;
            }
            Collection<SampleTimeResult> results = new ArrayList<SampleTimeResult>();
            results.add(new SampleTimeResult(ResultRole.PRIMARY, "measureAppMenuConstructorJDK", buffer, control.benchmarkParams.getTimeUnit()));
            return results;
        } else
            throw new IllegalStateException("Harness failed to distribute threads among groups properly");
    }

    public void measureAppMenuConstructorJDK_sample_jmhStub(InfraControl control, SampleBuffer buffer, int targetSamples, long opsPerInv, int batchSize, AppMenuBenchmark_jmh l_appmenubenchmark0_0, Blackhole_jmh l_blackhole1_1) throws Throwable {
        long realTime = 0;
        int rnd = (int)System.nanoTime();
        int rndMask = startRndMask;
        long time = 0;
        int currentStride = 0;
        do {
            rnd = (rnd * 1664525 + 1013904223);
            boolean sample = (rnd & rndMask) == 0;
            if (sample) {
                time = System.nanoTime();
            }
            for (int b = 0; b < batchSize; b++) {
                if (control.volatileSpoiler) return;
                l_appmenubenchmark0_0.measureAppMenuConstructorJDK();
            }
            if (sample) {
                buffer.add((System.nanoTime() - time) / opsPerInv);
                if (currentStride++ > targetSamples) {
                    buffer.half();
                    currentStride = 0;
                    rndMask = (rndMask << 1) + 1;
                }
            }
        } while(!control.isDone);
        startRndMask = Math.max(startRndMask, rndMask);
    }


    public Collection<SingleShotResult> measureAppMenuConstructorJDK_SingleShotTime(InfraControl control, ThreadParams threadParams) throws Throwable {
        if (threadParams.getSubgroupIndex() == 0) {
            Blackhole_jmh l_blackhole1_1 = _jmh_tryInit_f_blackhole1_1(control, threadParams);
            AppMenuBenchmark_jmh l_appmenubenchmark0_0 = _jmh_tryInit_f_appmenubenchmark0_0(control, threadParams);

            control.preSetup();
            if (!l_blackhole1_1.readyIteration) {
                l_blackhole1_1.clearSinks();
                l_blackhole1_1.readyIteration = true;
            }

            RawResults res = new RawResults(control.benchmarkParams.getOpsPerInvocation());
            int batchSize = control.iterationParams.getBatchSize();
            measureAppMenuConstructorJDK_ss_jmhStub(control, batchSize, res, l_appmenubenchmark0_0, l_blackhole1_1);
            control.preTearDown();
            if (l_blackhole1_1.readyIteration) {
                l_blackhole1_1.readyIteration = false;
            }

            if (control.isLastIteration()) {
                f_appmenubenchmark0_0 = null;
                f_blackhole1_1 = null;
            }
            Collection<SingleShotResult> results = new ArrayList<SingleShotResult>();
            results.add(new SingleShotResult(ResultRole.PRIMARY, "measureAppMenuConstructorJDK", res.getTime(), control.benchmarkParams.getTimeUnit()));
            return results;
        } else
            throw new IllegalStateException("Harness failed to distribute threads among groups properly");
    }

    public void measureAppMenuConstructorJDK_ss_jmhStub(InfraControl control, int batchSize, RawResults result, AppMenuBenchmark_jmh l_appmenubenchmark0_0, Blackhole_jmh l_blackhole1_1) throws Throwable {
        long realTime = 0;
        result.startTime = System.nanoTime();
        for (int b = 0; b < batchSize; b++) {
            if (control.volatileSpoiler) return;
            l_appmenubenchmark0_0.measureAppMenuConstructorJDK();
        }
        result.stopTime = System.nanoTime();
        result.realTime = realTime;
    }

    
    AppMenuBenchmark_jmh f_appmenubenchmark0_0;
    
    AppMenuBenchmark_jmh _jmh_tryInit_f_appmenubenchmark0_0(InfraControl control, ThreadParams threadParams) throws Throwable {
        if (f_appmenubenchmark0_0 == null) {
            AppMenuBenchmark_jmh val = new AppMenuBenchmark_jmh();
            val.readyTrial = true;
            f_appmenubenchmark0_0 = val;
        }
        return f_appmenubenchmark0_0;
    }
    
    Blackhole_jmh f_blackhole1_1;
    
    Blackhole_jmh _jmh_tryInit_f_blackhole1_1(InfraControl control, ThreadParams threadParams) throws Throwable {
        if (f_blackhole1_1 == null) {
            Blackhole_jmh val = new Blackhole_jmh();
            val.readyTrial = true;
            f_blackhole1_1 = val;
        }
        return f_blackhole1_1;
    }


}

