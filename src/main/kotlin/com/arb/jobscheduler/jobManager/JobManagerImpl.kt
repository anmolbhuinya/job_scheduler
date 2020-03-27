package com.arb.jobscheduler.jobManager

import com.arb.jobscheduler.job.Job
import com.arb.jobscheduler.jobStore.JobStore
import com.arb.jobscheduler.scheduler.JobScheduler

class JobManagerImpl(jobStore: JobStore,jobScheduler: JobScheduler):JobManager( jobStore,jobScheduler) {

    override fun createJob(job: Job) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun readJob(job: Job) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateJob(job: Job) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteJob(job: Job) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun scheduleJob(job: Job) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun suspendJob(job: Job) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun pollAndExecuteJob() {
        val jobList: List<Job> = jobStore.getAllPendingJobs()
    }
}