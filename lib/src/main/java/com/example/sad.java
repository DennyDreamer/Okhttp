public JSONObject getJSONObject(String url, Map<String, String> map, final VolleyJsonCallback callback){
        JSONObject params = null;
        if(map != null){
        params = new JSONObject(map);
        }
        JsonObjectRequest jObjRequest = new JsonObjectRequest(url, params,
        new Response.Listener<JSONObject>() {
@Override
public void onResponse(JSONObject result) {
        callback.onSuccess(result);
        }
        }, new Response.ErrorListener() {
@Override
public void onErrorResponse(VolleyError arg0) {
// TODO Auto-generated method stub
        Log.v("error", arg0.toString());
        }
        });
        RequestQueueSingleton.getInstance(mCtx).addToRequestQueue(jObjRequest);
        return null;
        }
        以下是在同一个类中定义的接口
public interface VolleyJsonCallback{
    void onSuccess(JSONObject result);
}