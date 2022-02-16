package com.kiki.awsimageupload.bucket;

public enum BucketName {
    PROFILE_IMAGE("kikicode-image-upload-123");

    private final String bucketName;

    BucketName(String bucketName){
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
