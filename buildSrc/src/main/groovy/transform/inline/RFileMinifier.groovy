package transform.inline

class RFileMinifier {

    static Map<String, Integer> parseRFile() {
        // 读取R文件
        File rFile = new File("./build/intermediates/runtime_symbol_list/release/R.txt")
//        File rFile = new File("./build/intermediates/runtime_symbol_list/debug/R.txt")
        BufferedReader reader = new BufferedReader(new FileReader(rFile))

        // 解析R文件
        Map<String, Integer> resourceIds = new HashMap<>()
        String line
        while ((line = reader.readLine()) != null) {
            if (line == null || line.isEmpty()) {
                continue
            }
            def datas = line.split(" ")
            String resourceName = datas[2]
            Integer resourceId = Integer.parseInt(datas[3].substring(2), 16)
            resourceIds.put(resourceName, resourceId)
        }

        return resourceIds
    }
}