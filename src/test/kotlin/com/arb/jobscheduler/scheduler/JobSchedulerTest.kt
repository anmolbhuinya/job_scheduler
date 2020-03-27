package com.arb.jobscheduler.scheduler

import com.arb.jobscheduler.job.Job
import com.arb.jobscheduler.job.PrintJob
import org.junit.Test

class JobSchedulerTest {

    @Test
    fun testJobScheduler(){
        val jobScheduler: JobScheduler = JobScheduler(10)

        val job1 = PrintJob("I play hockey", 10);
        val job2 = PrintJob("I am Anmol", 0);
        val job3 = PrintJob("In ground", 20);

        val fut1 = jobScheduler.scheduleJob(job1)
        val fut2 = jobScheduler.scheduleJob(job2)
        val fut3 = jobScheduler.scheduleJob(job3)

        fut1.get()
        fut2.get()
        fut3.get()
    }
}