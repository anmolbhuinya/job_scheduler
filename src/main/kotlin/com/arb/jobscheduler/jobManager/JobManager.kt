package com.arb.jobscheduler.jobManager

import com.arb.jobscheduler.job.Job
import com.arb.jobscheduler.jobStore.JobStore
import com.arb.jobscheduler.scheduler.JobScheduler

abstract class JobManager(val jobStore: JobStore, val jobScheduler: JobScheduler){
    abstract fun createJob(job: Job)
    abstract fun readJob(job: Job)
    abstract fun updateJob(job: Job)
    abstract fun deleteJob(job: Job)
    abstract fun scheduleJob(job:Job)
    abstract fun suspendJob(job:Job)
    abstract fun pollAndExecuteJob()
}