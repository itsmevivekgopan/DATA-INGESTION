package com.pipeline.pipelineOptions;

import org.apache.beam.sdk.options.Default;
import org.apache.beam.sdk.options.Description;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.options.Validation;

/**
 * Pipeline options for data ingestion pipeline
 */
public interface DataIngestionPipelineOptions extends PipelineOptions {
    
    @Description("GCS path for customer CSV input")
    @Default.String("gs://your-bucket/data/customers.csv")
    String getCustomerInputPath();
    void setCustomerInputPath(String value);
    
    @Description("GCS path for transaction CSV input")
    @Default.String("gs://your-bucket/data/transactions.csv")
    String getTransactionInputPath();
    void setTransactionInputPath(String value);
    
    @Description("BigQuery dataset name")
    @Validation.Required
    String getBigQueryDataset();
    void setBigQueryDataset(String value);
    
    @Description("Customer table name in BigQuery")
    @Default.String("customers")
    String getCustomerTableName();
    void setCustomerTableName(String value);
    
    @Description("Transaction table name in BigQuery")
    @Default.String("transactions")
    String getTransactionTableName();
    void setTransactionTableName(String value);
    
    @Description("Dead letter path for invalid records")
    @Default.String("gs://your-bucket/dead-letter")
    String getDeadLetterPath();
    void setDeadLetterPath(String value);
}