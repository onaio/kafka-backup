package de.azapps.kafkabackup.common.partition;

import java.nio.file.Path;
import java.nio.file.Paths;

class PartitionUtils {
    static Path indexFile(Path topicDir, int partition) {
        return Paths.get(topicDir.toString(), String.format("index_partition_%03d",partition));
    }
}