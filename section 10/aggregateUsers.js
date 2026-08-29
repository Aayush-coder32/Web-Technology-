const { MongoClient } = require("mongodb");
const uri = "mongodb://localhost:27017/";
const dbName = "userDB";
const collectionName = "users";
async function runAggregation() {
 const client = new MongoClient(uri);
 try {
 await client.connect();
 console.log("Connected to MongoDB");
 const db = client.db(dbName);
 const collection = db.collection(collectionName);
 const pipeline = [
 { $match: { age: { $gte: 18 } } },
 {
 $group: {
 _id: "$city",
 averageAge: { $avg: "$age" },
 userCount: { $sum: 1 },
 },
 },
 { $sort: { averageAge: -1 } },
 ];
  const result = await collection.aggregate(pipeline).toArray();
 console.log("Aggregation Results:");
 result.forEach((result) => {
 console.log(`City: ${result._id}, Average Age: ${result.averageAge.toFixed(2)}, User Count:
${result.userCount}`);
 });
 } catch (error) {
 console.error("Error:", error);
 } finally {
 await client.close();
 }
}
runAggregation();

