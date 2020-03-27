package com.arb.jobscheduler.scheduler

import com.arb.jobscheduler.job.Job
import java.util.concurrent.Executors
import java.util.concurrent.ScheduledExecutorService
import java.util.concurrent.ScheduledFuture
import java.util.concurrent.TimeUnit


class JobScheduler(val poolSize:Int) {
    private lateinit var jobExceutor: ScheduledExecutorService;

    init {
        jobExceutor = Executors.newScheduledThreadPool(poolSize)
    }


    fun scheduleJob(job: Job): ScheduledFuture<*> {
        return jobExceutor.schedule(job, job.delay, TimeUnit.SECONDS)
    }
}