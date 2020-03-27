package com.arb.jobscheduler.jobStore

import com.arb.jobscheduler.job.Job

interface JobStore {
    fun createJob(job: Job)
    fun readJob(jobId: Long)
    fun updateJob(job: Job)
    fun deleteJob(job: Job)
    fun getAllPendingJobs(): List<Long>
}